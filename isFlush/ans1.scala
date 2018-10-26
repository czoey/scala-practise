object Kata {
  def isFlush(cards: List[String]): Boolean = {
  	val testChar = cards.apply(0).takeRight(1)
  	var i = 1
  	var res = true
  	while(i < 5) {
  		if(cards.apply(i).takeRight(1) != testChar) {
  			res = false
  		}
  		i += 1
  	}
  	res
  }
}