package groovy.groovyInAction.second

//#!/usr/bin/groovy

/**class*/
//class Book{
//    private String title
//    Book(String theTitle){
//        title = theTitle
//    }
//    String getTitle(){
//        return title
//    }
//}

/**new class*/
//Book gina = new Book('Groovy in Action')
//assert gina.getTitle() == 'Groovy in Action'
//assert getTitleBackwards(gina) == 'noitcA ni yvoorG'
//
//String getTitleBackwards(book){
//    title = book.getTitle()
//    return title.reverse()
//}


/**class book*/
//class Book{
//    String title
//}
//def groovyBook = new Book()
//groovyBook.setTitle('Groovy conquers the world')
//assert groovyBook.getTitle() == 'Groovy conquers the world'
//
//groovyBook.title = 'Groovy in Action'
//assert groovyBook.title == 'Groovy in Action'


/**String*/
//def nick = "Gina"
//def book = "Groovy in Action"
//assert "$nick is $book" == 'Gina is Groovy in Action'


/**assert*/
//assert(true)
//assert 1 == 1
//def x = 1
//assert x == 1
//def y=1;assert y==1
//
//assert x == 'hey, this is really the content of x'
//println x

/**regular expression*/
//assert '123456' =~ /\d+/
//assert 'xxxxx' == '12345'.replaceAll(/\d/,'x')

/**Integer*/
//def x = 1
//def y = 2
//assert x + y == 3
//assert x.plus(y) == 3
//assert x instanceof Integer

/**List,Map,Range*/
//def roman = ['','I','II','III','IV','V','VI','VII']
//assert roman[4] == 'IV'
//roman[8] = 'VIII'
//assert roman.size() == 9
//
//def http = [
//        100 : 'CONTINUE',
//        200 : 'OK',
//        400 : 'BAD REQUEST'
//]
//assert http[200] == 'OK'
//http[500] = 'INTERNAL SERVER ERROR'
//assert http.size() == 4
//
//def x = 1..10
//assert x.contains(5)
//assert x.contains(15) == false
//assert x.size() == 10
//assert x.from == 1
//assert x.to == 10
//assert x.reverse() == 10..1

/**closure*/
//[1,2,3].each{entry -> println entry}
//
//def totalClinks = 0
//def partyPeople = 100
//1.upto(partyPeople) { guestNumber ->
//    clinksWithGuest = guestNumber - 1
//    totalClinks += clinksWithGuest
//}
//assert totalClinks == (partyPeople*(partyPeople-1))/2

/**control struct*/
//if(false) assert false
//
//if(null) assert false else assert true
//
//def i = 0
//while(i<10){
//    i++
//}
//assert i == 10
//
//def clinks = 0
//for(remainingGuests in 0..9){
//    clinks += remainingGuests
//}
//assert clinks  ==  (10*9)/2
//
//def list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//for (j in list) { assert j == list[j] }
//
//list.each() { item ->
//    assert item == list[item]
//}
//
//switch(3){
//    case 1: assert false;break
//    case 3: assert true;break
//    default: assert false
//}

/**GDK*/
def with = 'Hello world'.startsWith("H")
println with

//getMetaClass().invokeMethod(this, "foo", EMPTY_PARAMS_ARRAY)

def code = '1+'
code += System.getProperty('os.version')
println code
println evaluate(code)