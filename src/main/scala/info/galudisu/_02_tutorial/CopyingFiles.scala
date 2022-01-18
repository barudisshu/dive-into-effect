package info.galudisu._02_tutorial

import cats.effect.{IO, Resource}

import java.io.{File, FileInputStream}

object CopyingFiles {

  def inputStream(f: File): Resource[IO, FileInputStream] =
    Resource.make {
      IO.blocking(new FileInputStream(f))
    } { inStream =>
      IO.blocking(inStream.close()).handleErrorWith(_ => IO.unit)
    }
}
