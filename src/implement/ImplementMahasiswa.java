/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import entity.EntitasMahasiswa;
import interfaces.InterfaceMahasiswa;
/**
 *
 * @author My Komputer
 */
public class ImplementMahasiswa implements InterfaceMahasiswa{
    //Penerapan metode dari Interface
    public boolean cekLogin(EntitasMahasiswa e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        boolean status = false;
        if(e.getUser().equals("reguler") && 
                e.getPassword().equals("admin")){
            status = true;
        }
        else if(e.getUser().equals("international") && 
                e.getPassword().equals("admin")){
            status = true;
            
        }
        return status;
    }}
