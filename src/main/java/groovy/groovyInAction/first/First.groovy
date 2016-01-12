package groovy.groovyInAction.first

//#!/usr/bin/groovy

/**读取文件并在每行打印行号*/
//def number = 0
//new File('d://a//1.txt').eachLine {line ->
//    number ++
//    println "$number : $line"
//}

/**输出类的类型*/
//def classes = [String, List, File]
//for(clazz in classes){
//    println clazz.'package'.name
//}


/**输出类的类型*/
//println([String, List, File].'package'.name)

/**处理xml*/
//def customers = new XmlSlurper().parse(new File('customers.xml'))
//for (customer in customers.corporate.customer) {
//    println "${customer.@name} works for ${customer.@company}"
//}

/**打印当前目录*/
new File('.').eachFileRecurse {println it}