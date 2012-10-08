package controllers

import play.api._
import play.api.mvc._
import org.jclouds.filesystem.reference.FilesystemConstants
import org.jclouds.blobstore.BlobStoreContextFactory

object Application extends Controller {
  def index = Action {    
    val properties = new java.util.Properties

    properties.setProperty(FilesystemConstants.PROPERTY_BASEDIR, "./tmp/blobstore")

    // This command throws a massive Guice stack trace
    new BlobStoreContextFactory().createContext("filesystem", properties)

    Ok("If only we could have gotten here...")
  }
}