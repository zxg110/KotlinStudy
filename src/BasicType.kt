/**
 * 1.== 比较数值, 而===比较的是地址
 * 2.在 java 平台上，数值被 JVM 虚拟机以字节码的方式物理存储的，
 *   除非我们需要做可空标识(比如说 Int?) 或者涉及泛型。在后者中数值是装箱的，装箱就意味着封装成对象
 */
fun main(args: Array<String>) {
    valueCompare()
    addressCompare()
    valueCompareWithAddress()
}

/**
 * 数值比较
 */
fun valueCompare() {
    val a = 1000
    val b: Int = a
    val c: Int = a
    println("valueCompare b == c:" + (b == c))
    println("valueCompare b === c:" + (b === c))
}

/**
 * 对象地址比较
 */
fun addressCompare() {
    val a: Int? = 1000
    //对象b，引用指向对象a
    val b: Int? = a
    //对象c,引用指向对象a
    val c: Int? = a
    println("addressCompare b == c:" + (b == c))
    //均是a对象引用地址，true
    println("addressCompare b === c:" + (b === c))
}

fun valueCompareWithAddress() {
    //数值a=1000
    val a = 1000
    //对象b,保存值为1000
    val b: Int? = a
    //对象c,保存值为1000
    val c: Int? = a
    println("valueCompareWithAddress b == c:" + (b == c))
    //b与c是两个对象，地址不同为false
    println("valueCompareWithAddress b === c:" + (b === c))
}

/**
 * 显示转换
 * toByte(): Byte
 * toShort(): Short
 * toInt(): Int
 * toLong(): Long
 * toFloat(): Float
 * toDouble(): Double
 * toChar(): Char
 */
fun turn() {
    val b: Byte = 1
    val i: Int = b.toInt()
}