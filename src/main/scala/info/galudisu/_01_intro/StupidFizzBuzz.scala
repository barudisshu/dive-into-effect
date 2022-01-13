package info.galudisu._01_intro

import cats.effect.{IO, IOApp}

import scala.concurrent.duration.*

object StupidFizzBuzz extends IOApp.Simple {
  override def run: IO[Unit] = IO.println("Hello") >> IO.println("World")
}
