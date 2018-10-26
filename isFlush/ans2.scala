object Kata {
  def isFlush(cards: List[String]): Boolean = {
  	val testChar = cards.apply(0).takeRight(1)
  	var res = true
  	for(i <- 1 to 4) {
  		if(cards.apply(i).takeRight(1) != testChar) {
  			res = false
  		}
  	}
  	res
  }
}
