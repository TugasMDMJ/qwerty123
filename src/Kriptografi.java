/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bagus Kurniawan
 */import java.io.*;
import javax.swing.*;
public class Kriptografi {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog ("Masukkan Nama Yang Akan Di Enkripsi");
try{InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int key = 3;
String encrypted = encrypt(str, key);
String decrypted = decrypt(encrypted, key);
JOptionPane.showMessageDialog(null,"Pesan Asli :\n"+str+"\nHasil Enkripsi :\n"+encrypted+"\nHasil Deskripsi :\n"+decrypted);
} catch (Exception e){
System.out.println(e);
System.exit(0);
}
   }
public static String encrypt(String str, int key) {
String encrypted = "";
for(int i = 0; i < str.length(); i++) {
int c = str.charAt(i);
if (Character.isUpperCase(c)) {
c = c + (key % 26);
if (c > 'Z')
c = c - 26;
} else if (Character.isLowerCase(c)) {
c = c + (key % 26);
if (c > 'z')
c = c - 26;
}
encrypted += (char) c;
}
return encrypted;
}

public static String decrypt(String str, int key)
{
String decrypted = "";
for(int i = 0; i < str.length(); i++) {
int c = str.charAt(i);
if (Character.isUpperCase(c)) {
c = c - (key % 26);
if (c < 'A')
c = c + 26;
} else if (Character.isLowerCase(c)) {
c = c - (key % 26);
if (c < 'a')
c = c + 26;
}
decrypted += (char) c;
}
return decrypted;
}
}



    
  

