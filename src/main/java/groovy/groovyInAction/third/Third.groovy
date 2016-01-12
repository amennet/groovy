package groovy.groovyInAction.third
//Groove data type

/**new class*/
//assert 'ABCDE'.indexOf(67) == 2
//println 1.plus(1)

/**object*/ //can't run
//def node = document.findMyNode()
//log.info node
//db.store node

/**overloading == + */
//class Money{
//    private int amount
//    private String currency
//    Money(amountValue, currentValue){
//        amount = amountValue
//        currency = currentValue
//    }
//    boolean equals(Object other){
//        if(null == other) return false
//        if(!(other instanceof Money)) return false
//        if(currency != other.currency) return false
//        if(amount != other.amount) return false
//        return true
//    }
//    int hashCode() {
//        amount.hashCode() + currency.hashCode()
//    }
//    Money plus(Money other){
//        if(null == other) return null
//        if(other.currency != currency){
//            throw new IllegalArgumentException("cannot add $other.currency to $currency")
//        }
//        return new Money(amount + other.amount, currency)
//    }
//    Money plus(Integer more){
//        return new Money(amount + more, currency)
//    }
//}
//def buck = new Money(1, 'USD')
//assert buck
//assert buck == new Money(1, 'USD')
//assert buck + buck == new Money(2, 'USD')
//assert buck + 1 == new Money(2, 'USD')

/**working with gStrings*/
//me = 'Tarzan'
//you = 'Jane'
//line = "me $me - you $you"
//assert line == 'me Tarzan - you Jane'
//
//date = new Date(0)
//out = "Year $date.year Month $date.month Day $date.date"
//assert out == 'Year 70 Month 0 Day 1'
//
//out = "Date is ${date.toGMTString()}!"
//assert out == 'Date is 1 Jan 1970 00:00:00 GMT!'
//sql = """
//SELECT FROM MyTable WHERE Year = $date.year
//"""
//assert sql == """
//SELECT FROM MyTable WHERE Year = 70
//"""
//
//out = "my 0.02\$"
//assert out == 'my 0.02$'
//
//assert line instanceof GString
//assert line.strings[0] == 'me '
//assert line.strings[1] == ' - you '
//assert line.values[0] == 'Tarzan'
//assert line.values[1] == 'Jane'

/**print*/
//System.out.print('Hello Groory')
//print('Hello Groovy')
//println 'Hello Groovy'
//
//greeting = "Hello Groovy!"
//assert greeting.startsWith('Hello')
//assert greeting.getAt(0) == 'H'
//assert greeting[0] == 'H'
//assert greeting.indexOf('Groovy') >= 0
//println greeting.indexOf('Groovy')
//assert greeting.contains('Groovy')
//assert greeting[6..11] == 'Groovy'
//assert 'Hi' + greeting - 'Hello' == 'Hi Groovy!'
//assert greeting.count('o') == 3
//assert 'x'.padLeft(3) == '  x'
//assert 'x'.padRight(3,'_') == 'x__'
//assert 'x'.center(3) == ' x '
//assert 'x' * 3 == "xxx"

/**modify string*/
//greeting = "Hello"
//println greeting.getClass()
//greeting <<= ' Groovy'
//assert greeting instanceof  java.lang.StringBuffer
//greeting << "!"
//assert greeting.toString() == 'Hello Groovy!'
//greeting[1..4] = 'i'
//assert greeting.toString() == "Hi Groovy!"

/**正则表达式*/
//assert "abc" == /abc/
//assert "some\\d+" == /some\d+/
//def reference = "hello"
//assert reference == /$reference/
//assert "\$" == /$/
//
//def url = 'href="http://www.baidu.com",""'
//assert url =~ /href="(.*)"/
//assert url =~ /href="(.*?)"/

/**Regular expressions*/
//twister = 'she sells sea shells at the sea shore of seychelles'
//assert twister =~ /s.a/
//finder = (twister =~ /s.a/)
//assert finder instanceof java.util.regex.Matcher
//
//assert twister ==~ /(\w+ \w+)*/
//
//WORD = /\w+/
//matches = (twister ==~ /($WORD $WORD)*/)
//assert matches instanceof java.lang.Boolean
//
//assert (twister ==~ /s.e/) == false
//
//wordsByX = twister.replaceAll(WORD, 'x')
//assert wordsByX == 'x x x x x x x x x x'
//words = twister.split(/ /)
//assert words.size() == 10
//assert words[0] == 'she'

/**正则匹配和替换*/
//myFairStringy = 'The rain in Spain stays mainly in the plain!'
//BOUNDS = /\b/
//rhyme = /$BOUNDS\w*ain$BOUNDS/
//found = ''
//myFairStringy.eachMatch(rhyme){match ->
//    found += match + ' '
//}
//assert found == 'rain Spain plain '
//
//found = ''
//(myFairStringy =~ rhyme).each { match ->
//    found += match + ' '
//}
//assert found == 'rain Spain plain '
//
//cloze = myFairStringy.replaceAll(rhyme){ it-'ain'+'___'}
//assert cloze == 'The r___ in Sp___ stays mainly in the pl___!'

/**匹配所有的非空白字符*/
//matcher = 'a b c' =~ /\S/
//assert matcher[0] == 'a'
//println matcher[1..2]
//assert matcher.count == 3
//
//matcher = 'a:1 b:2 c:3' =~ /(\S+):(\S+)/
//assert matcher.hasGroup()
//assert matcher[0] == ['a:1', 'a', '1']
//
//('xy' =~ /(.)(.)/).each { all, x, y ->
//    assert all == 'xy'
//    assert x == 'x'
//    assert y == 'y'
//}
//Matcher.getLastMatcher()
//Java正则表达式

/**Pattern*/
//twister = 'she sells sea shells at the sea shore of seychelles'
//regex = /\b(\w)\w*\1\b/
//
//start = System.currentTimeMillis()
//100000.times {
//    twister =~ regex
//}
//first = System.currentTimeMillis() - start
//
//start = System.currentTimeMillis()
//pattern = ~regex
//100000.times {
//    pattern.matcher(twister)
//}
//second = System.currentTimeMillis() - start
//println first + " " + second
//assert first > second * 1.20

/**Patterns in grep() and switch()*/
//assert (~/..../).isCase('bear')
//switch('bear'){
//    case ~/..../:assert true;break
//    default : assert false
//}
//beasts = ['bear', 'wolf', 'tiger', 'regex']
//assert beasts.grep(~/..../) == ['bear', 'wolf']

/**number*/
println 2G+1G