package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class MainController extends Controller {
    
    public static Result index() {
        return ok(views.html.index.render("Hello from Java"));
    }

    public static Result missions(){
    	return ok(views.html.missions.render());
    }
    
    public static Result map(){
    	return ok(views.html.map.render());
    }
}
