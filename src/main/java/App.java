import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
       // Map<String,Object> model = new HashMap<String,Object>();
        String layout = "templates/layout.hbs";

        get("/", (request, response) -> {
            Map<String, Object> model=new HashMap<>();
            model.put("templates","template/homepage.hbs");
            return new ModelAndView(model, "homepage.hbs");
        }, new HandlebarsTemplateEngine());

        get("/logs-form", (request, response)->{
            Map<String, Object> model=new HashMap<>();
            return new ModelAndView(model, "logs-form.hbs");
        }, new HandlebarsTemplateEngine());

        post("/login/new", (request, response) -> {
            Map<String , Object> model= new HashMap<>();
            String name = request.queryParams("name");
            String email = request.queryParams("email");
            String phone = request.queryParams("phone");
            String homeAddress = request.queryParams("homeAddress");
            String password = request.queryParams("password");

            LoginPage login = new LoginPage(name,email,phone, homeAddress , password);
          //  login.save();
            return new ModelAndView(model,"logs-form.hbs");
        },new HandlebarsTemplateEngine());






        get("/goods/new",(request, response) -> {
            Map<String,Object> model=new HashMap<String, Object>();
            return new ModelAndView(model,"goods-views");
        },new HandlebarsTemplateEngine());

        post("/create/goods/new",(request, response) -> {
            Map<String,Object> model=new HashMap<String, Object>();
            String name=request.queryParams("name");
            String serial=request.queryParams("serial");
            String quantity=request.queryParams("quantity");
            String origin=request.queryParams("origin");
            GoodsDetails goodsDetails=new GoodsDetails(name, serial,quantity,origin);
//            ranger.save();
            return new ModelAndView(model,"goods-forms.hbs");
        },new HandlebarsTemplateEngine());

    }

}
