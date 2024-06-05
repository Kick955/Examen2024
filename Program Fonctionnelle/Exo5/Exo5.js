def carre_des_nombres(nombre):
    
    nombre_str = str(nombre)
    
    
    resultat = ""
    
   
    for chiffre in nombre_str:
        
        carre = int(chiffre) ** 2
       
        resultat += str(carre)
    
   
    return int(resultat)

print(carre_des_nombres(9119))  

