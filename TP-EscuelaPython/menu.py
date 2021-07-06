lista = list()

class Alumnos:
    def __init__(self):
        self.matricula = ()
        self.nombre = (" ")
        self.edad = ()
        self.nota= ( )

def menu():
    selection = 0
    while selection != 4 :
        print("******************************")
        print("Registro de alumnos")
        print("Elija una de las opciones")
        print("******************************")
        print("1.Registrar el alumno")
        print("2.Lista de los alumnos")
        print("3.Buscar un alumno")
        print("4.Salir")
        selection = int(input("Elija una opción: "))
        if selection == 1:
            register()
        if selection == 2:
            show()
        if selection == 3:
            search()
        if selection == 4:
            closeapp()

def register():
    print("Registrar alumnos")
    alumno = Alumnos()
    alumno.matricula = int(input("Introduce matricula del alumno: "))
    alumno.nombre = input("Introduce nombre del alumno: ")
    alumno.edad = int(input("Introduce edad del alumno: "))
    alumno.nota = input("Introduce nota del alumno: ")
    lista.append(alumno)

def show():
    print("Lista Alumnos")
    for alumno in lista:
        print("Matricula: \n", alumno.matricula,  "Nombre: \n" + alumno.nombre, "Edad: \n", alumno.edad, "Nota: \n", alumno.nota)
        

def search():
    print("Buscar alumno")

def closeapp():
    print("Adiós!")

menu()

