package models

/**
 * Created with IntelliJ IDEA.
 * User: andy
 * Date: 14/12/12
 */
case class Task (id: Long, label: String)

object Task {
  def all(): List[Task] = Nil

  def create(label: String) {}

  def delete(id: Long) {}
}
