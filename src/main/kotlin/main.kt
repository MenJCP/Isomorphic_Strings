fun main() {
    print("Insertar el tamaño de la primera palabra: ")
    var i=0
    var size1= Integer.valueOf(readLine())
    var array1: CharArray = CharArray(size1)

    while(i < size1){
        println("Ingrese la letra #$i de la primera palabra")
        array1[i]= readLine()!!.first()
        i++
    }
    for(o in array1){
        println(o)
    }

    print("Insertar el tamaño de la segunda palabra: ")
    var x=0
    var size2= Integer.valueOf(readLine())
    var array2: CharArray = CharArray(size2)

    while(x < size2){
        println("Ingrese la letra #$x de la primera palabra")
        array2[x]= readLine()!!.first()
        x++
    }
    for(u in array1){
        println(u)
    }
    var z=0
    var array3: CharArray = CharArray(size1)
    var array4: CharArray = CharArray(size2)

    while(z < size1){
        if(array3[z] != array4[z]){
            println("No son isomorfas")
        } else{ println("Son isomorfas")}
        z++
    }
}