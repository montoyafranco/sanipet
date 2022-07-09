package Sanipet;

import java.time.LocalDate;

import appointments.AppointStatus;
import appointments.AppointType;
import appointments.Appointment;

import java.util.Date;
import java.util.Scanner;

public final class Creation {
  public static Owner newOwner() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your DNI: ");
    String dni = scanner.nextLine();
    System.out.println("Enter your name: " );
    String name = scanner.nextLine();
    System.out.println("Enter cellphone: ");
    String cellphone = scanner.nextLine();
    System.out.println("Enter your age: ");
    int age = scanner.nextInt();

    try {
      return new Owner(dni,name, cellphone, age);
    } catch (Exception err) {
      err.printStackTrace();
    }
    return null;
  }

  public static Patient newPatient(Owner owner) {
    PetType pet = Menu.askPetType();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your pet's name: " );
    String name = scanner.nextLine();
    System.out.println("Enter your pet's breed: ");
    String breed = scanner.nextLine();
    boolean isVaccinated = Menu.askYesNo("Is your pet vaccinated? [Y]/[N]");

    return new Patient(pet, name, breed, owner, isVaccinated);
  }

  public static void AppointmentOptions(int appointOption) {
    switch (appointOption) {
      case 1:
        System.out.println("Creating appointment");
        System.out.println("What type of appointment do your pet needs?");
        AppointType appointType = askAppointmentType();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a year");
        int year = sc.nextInt();
        System.out.println("Choose a month");
        int month = sc.nextInt();
        System.out.println("Choose a day ");
        int day = sc.nextInt();
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date);


//      Ask for doctors Kevin => Kevin.newSchuduledAppointment(st, dt);

        break;
      case 2:
        System.out.println("Updating appointment");
        break;
      case 3:
        System.out.println("Cancel appointment");
        break;
      case 4:
        System.out.println("Filtering by days");
        break;
      default:
        System.out.println("Wrong option");
    }
  }

  static AppointType askAppointmentType() {
    Scanner scanner = new Scanner(System.in);
    int userInput;
    AppointType type;

    do {
      System.out.println(
              """
                1. MEDICAL
                2. SURGERY
                3. AESTHETIC
              """);
      userInput = scanner.nextInt();

      type = userInput == 1 ?
              AppointType.MEDICAL :
             userInput == 2  ?
              AppointType.SURGERY :
              AppointType.AESTHETIC;

    } while(userInput < 1 || userInput > 3);

    return type;
  }
  
}
