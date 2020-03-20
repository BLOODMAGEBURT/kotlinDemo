data class Girl(var name: String, var age: Int, var height: Int, var address: String)

val girlDb = listOf<Girl>(
    Girl("ales", 18, 178, "河南"),
    Girl("bobo", 20, 178, "北京"),
    Girl("cici", 19, 178, "上海"),
    Girl("dalio", 30, 178, "山西"),
    Girl("ela", 25, 178, "山东"),
    Girl("fucker", 22, 178, "黑龙江"),
    Girl("gugu", 21, 178, "河南"),
    Girl("helio", 29, 178, "河南")
)

fun filterGirlByAddress(address: String): ArrayList<Girl> {

    val girls = ArrayList<Girl>()
    for (girl in girlDb) {
        if (girl.address == address) {

            girls.add(girl)
        }
    }

    return girls
}

fun filterGirlsByAge(age: Int): ArrayList<Girl> {

    val girls = ArrayList<Girl>()

    for (girl in girlDb) {
        if (girl.age < age) {
            girls.add(girl)
        }
    }

    return girls
}

fun filerGirlsByMore(age: Int, height: Int, address: String): ArrayList<Girl> {
    val girls = ArrayList<Girl>()

    return girls
}