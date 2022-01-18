package info.galudisu._01_intro

import cats.effect.IO
import weaver.*

object StupidFizzBuzzTest extends SimpleIOSuite {
  test("make sure IO computes the right result") {
    IO.pure(1).map(_ + 2).map { result =>
      expect.eql(result, 3)
    }
  }
}
