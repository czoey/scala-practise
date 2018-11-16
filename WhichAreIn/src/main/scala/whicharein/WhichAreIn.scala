package whicharein

object WhichAreIn {

  def inArray(array1: Array[String], array2: Array[String]): Array[String] = {
    array1.filter(m1 => {
      array2.map(_.indexOf(m1)).filter(_ >= 0).length > 0
    }).distinct.sorted
  }
}
