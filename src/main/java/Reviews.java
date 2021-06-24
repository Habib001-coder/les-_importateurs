public class Reviews {
    private String name;
    private String comment;

    public Reviews(String name,String comment){
        this.name=name;
        this.comment=comment;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public static Reviews setUpReview1(){
        return new Reviews("Sesan","Good services");
    }
    public static Reviews setUpReview2(){
        return new Reviews("Leon","Quick response");
    }

    public static Reviews setUpReview3(){
        return new Reviews("Linda","Average prices");
    }
}
