package controllers

import javax.inject._
import play.api._
import play.api.mvc._
//import org.slf4j.Logger
//import org.slf4j.LoggerFactory
import play.api.Logger
//import play.api.Logging then extends Loggin


/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
//  val logger: Logger = Logger(this.getClass())
  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Logger("play").info("hello from index - test2")
    Logger("play").error("Error from index - test2")
//    logger.info("Hello from index")
//    Logger.info("Hello!")
    Ok(views.html.index())
  }
  
  def explore() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.explore())
  }
  
  def tutorial() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.tutorial())
  }
  
}
