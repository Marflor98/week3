fun main() {
    print("Enter number of checks written this month ")

    var numchecks: String =readLine()!!;
    when
            (numchecks){ is 1...20
        ->println("Your bank’s service fees for the month are $10.10")};
    when
            (numchecks) { is 20...39
        ->println("Your bank's service fees for the month are $10.08")};
    when
            (numchecks) { is 40...59
        ->println("Your bank's service fees for the month are $10.06");
            }
    when (numchecks) { is 60...
        -> println("Your bank's service fees for the month are $10.04")}}
