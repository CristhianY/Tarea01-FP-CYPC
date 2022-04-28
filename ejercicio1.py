#Definir variables
intensidad:float
resistencia:float=4
potencia:float
#Datos de entrada
intencidad=float(input("Ingrese la intensidad:"))
#Solucion
potencia=resistencia*intencidad*intencidad
#Datos de salida
print(f"La potencia es de: {potencia}")