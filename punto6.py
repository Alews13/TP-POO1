class Persona:
    pass

class Alumno(Persona):
    def __init__(self, nombre):
        self.nombre = nombre
        self.es_alumno = True

class Docente(Persona):
    def __init__(self, nombre):
        self.nombre = nombre
        self.es_docente = True

# Alumno avanzado contratado como docente auxiliar: se crea como Alumno y luego se cambia su clase a una que herede de ambos? No se puede herencia múltiple en Python (sí se puede, pero cambiar clase a una subclase de ambas implicaría crear una nueva clase dinámicamente). O más simple: tener una clase AlumnoDocente que herede de Alumno y Docente? Python permite herencia múltiple. Entonces:
class AlumnoDocente(Alumno, Docente):
    pass

# Luego cuando se recibe, se cambia la clase a Docente:
objeto.__class__ = Docente