fun main() {
    print("Diga el tamaño de la primera palabra: ")
    var s1= Integer.valueOf(readLine())
    var list1:MutableList<Char> = mutableListOf()
    var w1: List<Char> = list1
    var i=0
    var r=0

    while(i < s1){
        println("Escriba la letra #$i de la primera palabra: ")
        list1.add(readLine()!!.first())
        i++
    }
    for(o in list1){
        print("")
        println(o)
    }
    print("Diga el tamaño de la segunda palabra: ")
    var s2= Integer.valueOf(readLine())
    var list2:MutableList<Char> = mutableListOf()
    var w2: List<Char> = list2


    while(r < s1){
        println("Escriba la letra #$r de la primera palabra: ")
        list2.add(readLine()!!.first())
        r++
    }
    for(u in list2){
        print("")
        println(u)
    }

    if(s1 != s2){
        println("No son isomorfas porque no poseen el mismo tamaño")
    }

    if(list1.contains(w1)){
      if(w1 != w2){
          println("No son isomorfas")
      } else{
          if(list2.contains(w2)){
              println("No son isomorfas")
              w1=w2
          }

      }
    }
    return println("Son isomorfas")
}