import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        Reviews.setUpReview1();
        Reviews.setUpReview2();
        Reviews.setUpReview3();
        // Map<String,Object> model = new HashMap<String,Object>();
        String layout = "templates/layout.hbs";

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("templates", "template/homepage.hbs");
            return new ModelAndView(model, "homepage.hbs");
        }, new HandlebarsTemplateEngine());

        //display details form
        get("/details-form", (request, response)->{
            Map<String, Object> model=new HashMap<>();
            return new ModelAndView(model, "details-form.hbs");
        }, new HandlebarsTemplateEngine());


        //process details-form
        get("/details",(request, response) -> {
            Map<String,Object> model = new HashMap<>();
            String flightNumber=request.queryParams("flightNumber");
            Integer arrivalTime=Integer.parseInt(request.queryParams("arrivalTime"));
            Integer customDuty=Integer.parseInt(request.queryParams("customDuty"));
            Integer containerNumber=Integer.parseInt(request.queryParams("containerNumber"));
            ShippingDetails shipDetails = new ShippingDetails(flightNumber,arrivalTime,customDuty,containerNumber);
            model.put("shipDetails",shipDetails);
            return new ModelAndView(model, "details-form.hbs");
        }, new HandlebarsTemplateEngine());


        //display details
        post("/details/new",(request, response) -> {
            Map<String,Object> model = new HashMap<>();
            String flightNumber=request.queryParams("flightNumber");
            Integer arrivalTime=Integer.parseInt(request.queryParams("arrivalTime"));
            Integer customDuty=Integer.parseInt(request.queryParams("customDuty"));
            Integer containerNumber=Integer.parseInt(request.queryParams("containerNumber"));
            ShippingDetails shipDetails = new ShippingDetails(flightNumber,arrivalTime,customDuty,containerNumber);
            model.put("shipDetails",shipDetails);
            return new ModelAndView(model, "details-view.hbs");
        }, new HandlebarsTemplateEngine());
    }
}