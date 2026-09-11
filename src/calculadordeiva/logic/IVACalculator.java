
package calculadordeiva.logic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

import java.util.ArrayList;
import calculadordeiva.model.Calculation;

public class IVACalculator {
   
    private ArrayList<Calculation> historial;
    
    public IVACalculator() {
    
        historial = new ArrayList<Calculation>();
        
    }
    
    public void addCalculation(double price) {
            
    Calculation newCalculation = new Calculation(price);
            
    historial.add(newCalculation);
     
    }
    
    public ArrayList<Calculation> getHistorial() {
        return historial;
    }
    
    public void saveHistorial(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("historial.txt"))){
            
            for (Calculation line : historial) {

                writer.write(line.toString());
                writer.newLine();
                
            }
            
        } catch (IOException e){
            
            e.printStackTrace();
            
        }
        
    }
    
    public void readHistorial(){  
                   
        File archivo = new File("historial.txt");
            
        if (!archivo.exists()){
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("historial.txt"))){
 
            String line;
            
            while ((line = reader.readLine()) != null) {
                
                String[] parts = line.split(" \\| ");
                String[] priceParts = parts[0].split(": ");
                double price = Double.parseDouble(priceParts[1]);
                addCalculation(price);
            }
            
        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
}
