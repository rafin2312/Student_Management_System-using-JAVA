package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class authentication {

    private static final String file_path = "src/files/admin.txt";
    private static final String StudentInformation = "src/files/students.txt";

    public boolean adminLogin(String username, String password){
        try (BufferedReader br = new BufferedReader(new FileReader(file_path))){
            String line;
            while ((line = br.readLine()) != null){
                String[] data = line.split(",");
                String AdminUsername = data[0];
                String AdminPassword = data[1];
                if(AdminUsername.equals(username) && AdminPassword.equals(password)){
                    return true;
                }
            }
        }catch (IOException e){
            System.out.println("Failed to read the file");
        }
        return false;
    }

}
