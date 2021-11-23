

    fun main(args: Array<String>) {

        //Create array of five empty String
        var movies = arrayOf("", "", "", "", "")

        //Create for loop to ake user enter five time
        for (time in 0..4) {
            print("Enter your Five favorite movies ${time + 1} : ")
            movies[time] = readLine()!!.toString()
        }

        // After user enter five movie show in print statement
        print("Your favorite movies : ")

        // Create variable to give space between them and same line.
        var spaces = ", "

        //Create for loop to hold five movie inside array 'updating'
        for (time in 0..4) {
            print("${movies[time]} $spaces")
        }
    }