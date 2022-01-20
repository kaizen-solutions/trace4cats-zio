package io.janstenpickle.trace4cats.inject.zio

import io.janstenpickle.trace4cats.Span
import io.janstenpickle.trace4cats.base.optics.Lens
import zio.Task

final case class Env(dummy: String, span: Span[Task])
object Env {
  def span: Lens[Env, Span[Task]] = Lens[Env, Span[Task]](_.span)(s => _.copy(span = s))
}
