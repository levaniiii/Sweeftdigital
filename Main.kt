fun main() {

    /* 1 */

    fun isPalindrome(text: String): Boolean {
        return text.lowercase() == text.lowercase().reversed()
    }

    val word = "oto"

    if (isPalindrome(word)) {
        println("Word \"$word\" is palindrome.")
    } else {
        println("Word \"$word\" is not palindrome.")
    }

    /* 2 */

    fun minSplit(amount: Int): Int {

        var currentAmount = amount
        var count = 0

        if (currentAmount >= 50) {
            do {
                count++
                currentAmount -= 50
            } while (currentAmount - 50 >= 0)
        }

        if (currentAmount in 20..49) {
            do {
                count++
                currentAmount -= 20
            } while (currentAmount - 20 >= 0)
        }

        if (currentAmount in 10..19) {
            do {
                count++
                currentAmount -= 10
            } while (currentAmount - 10 >= 0)
        }

        if (currentAmount in 5..9) {
            do {
                count++
                currentAmount -= 5
            } while (currentAmount - 5 >= 0)
        }

        if (currentAmount in 1..4) {
            do {
                count++
                currentAmount -= 1
            } while (currentAmount - 1 >= 0)
        }

        return count
    }

    print("Enter amount (cents): ")
    val amount = readLine()!!.toInt()

    val result = minSplit(amount)
    println(result)

    /* 3 */

    fun notContains(array: Array<Int>): Int {
        var count = 1
        var result = 0

        while (count <= array.count() + 1) {
            if (!array.contains(count)) {
                result = count
                break
            } else {
                count++
            }
        }

        return result
    }

    println(notContains(arrayOf(1, 2, 3, 4, 5)))

    /* 4 */

    fun isProperly(sequence: String): Boolean {
        val bracketsStack = arrayListOf<Char>()

        for (i in sequence) {
            if (i == '(') {
                bracketsStack.add(i)
            } else if (i == ')') {
                try {
                    bracketsStack.removeFirst()
                } catch (e: Exception) {
                    return false
                }
            }
        }

        return bracketsStack.isEmpty()
    }

    print("Enter string: ")
    val brackets = readLine().toString()

    if (isProperly(brackets)) {
        println("Sequence is valid.")
    } else {
        println("Sequence is not valid.")
    }

    /* 5 */

    fun count(n: Int): Int {
        return if (n <= 1) {
            n
        } else {
            count(n - 1) + count(n - 2)
        }
    }

    fun countVariants(stairsCount: Int): Int {
        return count(stairsCount + 1)
    }

    val result1 = countVariants(5)
    println(result1)

}
