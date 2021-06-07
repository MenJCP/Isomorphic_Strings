import java.util.HashMap

fun main() {
    println("Inserte la primera palabra")
    var p1= readLine()

    println("Inserte la primera palabra")
    var p2= readLine()

    if(p1 == null && p2 == null){
        return println("Debe agregar las palabras para poder identificar si son isomorfas")
    }

    if(p1?.length != p2?.length){
        return println("No son isomorfas porque no tienen el mismo tamaño")
    }

    var map= HashMap<Char,Char>()

    for(o in 0 until p1!!.length){
      val w1= p1[o]
      val w2= p2!![o]

      if(map.containsKey(w1)) {

          if (map[w1] != w2) {
              return println("No son isomorfas")

          } else {
              if (map.containsValue(w2)) {
                  return println("No son isomorfas")
                  map[w1] = w2

              }
          }

      }
    }
        return println("Son isomorfas")
}