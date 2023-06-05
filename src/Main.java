public class Main {
    public static void main(String[] args) {
        byte age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать");
        }


        byte temperature;
        temperature = -7;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }


        int speed = 60;
        if (speed > 60) {
            System.out.println("если скорость " + speed + " то, придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " то, можно ездить спокойно");
        }


        int age1 = 67;
        boolean goToSleep = 2 > age1;
        boolean detsad = (age1 >= 2 && age1 <= 6);
        boolean goToSchool = (age1 > 6 && age1 <= 18);
        boolean goToUniver = (age1 > 18 && age1 < 24);
        boolean goToWork = (age1 >= 24 && age1 <= 60);
        if (goToSleep) {
            System.out.println("Если возраст человека равен " + age1 + " то, ему пора спать");
        } else {
            if (detsad) {
                System.out.println("Если возраст человека равен " + age1 + " то, ему нужно ходить в детский сад");
            } else {
                if (goToSchool) {
                    System.out.println("Если возраст человека равен " + age1 + " то, ему нужно ходить в школу");
                } else {
                    if (goToUniver) {
                        System.out.println("Если возраст человека равен " + age1 + " то, его место в универе");
                    } else {
                        if (goToWork) {
                            System.out.println("Если возраст человека равен " + age1 + " то, ему пора ходить на работу");
                        } else {
                            System.out.println("Если возраст человека равен " + age1 + " то, он может отдохнуть");
                        }
                    }
                }

            }
        }

        int childrenAge = 15;
        boolean canNotArrive = childrenAge < 5;
        boolean canArriveWithAdult = (childrenAge >= 5 && childrenAge <= 14);
        if (canNotArrive) {System.out.println("Если возраст ребенка равен " + childrenAge + " то, ему нельзя кататься на аттракционе");} else {
            if (canArriveWithAdult) {System.out.println("Если возраст ребенка равен " + childrenAge + " то, ему нужно можно кататься на аттракционе в сопровождении");} else {
                System.out.println("Если возраст ребенка равен " + childrenAge + " то, ему можно кататься на аттракционе без сопровождении");}
        }


        int people = 44;
        int vagonSeat = 102;
        int seatPlace = 60;
        if ((people < vagonSeat)&& (people <= seatPlace)) { System.out.println("Если количество людей в вагоне равно " + people + " то, есть место для сидения");} else {
            if ((people <= vagonSeat)&&(people > seatPlace)) { System.out.println("Если количество людей в вагоне равно " + people + " то, есть стоячее место");} else {
                System.out.println("Если количество людей в вагоне равно " + people + " то, свободных мест нет");
            }
        }

        int one = 7 ;
        int two = 4;
        int three = 3;
        boolean oneReach = (one > two && one > three);
        boolean twoReach = (two > one && two > three);
        if (oneReach) { System.out.println("Первое число самое большое");} else {
            if (twoReach) {System.out.println("Второе число самое большое");} else {
                System.out.println("Третье число самое большое");
            }
        }

    }
}