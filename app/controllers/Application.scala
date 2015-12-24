package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  val message = "Fuck this SITE"

  def index = Action {
    Ok(views.html.index(message))
  }

}