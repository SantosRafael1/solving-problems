//SRV college wants to recognize the department which has succeeded 
//in getting the maximum number of placements for this academic year. 
//The departments that have participated in the recruitment 
//drive are CSE,ECE, MECH. Help the college find the department getting maximum placements.
//Check for all the possible output given in the sample snapshot

fun main() {
    print("Number of students in CSE: ")
    val cse = readLine()!!.toInt()
    print("Number of students in ECE: ")
    val ece = readLine()!!.toInt()
    print("Number of students in MECH: ")
    val mech = readLine()!!.toInt()

    if(cse < 0 || ece < 0 || mech < 0) {
        println("Input is invalid!");
    } else if(cse == ece && cse == mech && ece == mech) {
        println("None of the department has got the highest placement!");
    }

    else if(cse == ece) {
        println("CSE");
        println("ECE");
    } else if(mech == cse) {
        println("MECH");
        println("CSE");
    } else if(ece == mech) {
        println("ECE");
        println("MECH");
    }

    else if(cse > ece && cse > mech) {
        println("Highest departament: CSE");
    } else if(ece > cse && ece > mech) {
        println("Highest department: ECE");
    } else if(mech > cse && mech > ece) {
        println("Highest department: MECH");
    }
}