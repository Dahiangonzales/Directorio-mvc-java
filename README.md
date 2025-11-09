# 💎 Directorio MVC Java - Sistema de Gestión de Inventario de Joyas

## 🧠 Descripción General
Este proyecto implementa una aplicación de consola en **Java**, diseñada para gestionar un inventario de joyas utilizando el patrón **Modelo - Vista - Controlador (MVC)**.  
Permite registrar, consultar, listar, eliminar y buscar joyas por tipo o material.

---

## 👩‍💻 Integrantes del Proyecto
- **Juan Jose Gutierrez Rudas**
- **Lina Maria David Cabrera**
-  **Dahian Michelle Gonzales Diaz**
-   **Johan Alberto Majin**

**Asignatura:** Ingeniería de Software I  
**Docente:** Jorge Andrés Benavides  
**Fecha de Entrega:** 17 de noviembre de 2025  

---

## 🧩 Estructura del Proyecto

InventarioMVC-Lab3/
├── model/
│ ├── Jewelry.java
│ └── JewelryDAO.java
├── view/
│ └── JewelryView.java
├── controller/
│ └── CtrlJewelry.java
└── App.java

yaml
Copiar código

---

## ⚙️ Ejecución del Programa

### 🔹 Requisitos previos
- Tener instalado **Java 17 o superior**
- Tener configurado **Git** y un IDE como IntelliJ IDEA o VSCode

### 🔹 Pasos de ejecución
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/Dahiangonzales/Directorio-mvc-java.git
Abrir el proyecto en tu IDE.

Compilar y ejecutar la clase principal:

Copiar código
App.java
Interactuar con el menú desde la consola.

📜 Menú Principal
markdown
Copiar código
SISTEMA DE GESTIÓN DE INVENTARIO DE JOYAS
1. Agregar Joya
2. Buscar Joya por SKU
3. Mostrar Todas las Joyas
4. Eliminar Joya
5. Buscar por Tipo
6. Buscar por Material
7. Salir
💍 Funcionalidades Implementadas
Funcionalidad	Descripción
➕ Agregar Joya	Registra una nueva joya con sus datos completos
🔍 Buscar por SKU	Permite encontrar una joya por su código SKU
📋 Mostrar Todas	Lista todas las joyas disponibles
❌ Eliminar Joya	Elimina una joya existente por SKU
💎 Buscar por Tipo	Filtra joyas por tipo (anillo, collar, etc.)
⚙️ Buscar por Material	Filtra joyas según su material (oro, plata, platino)

🧪 Pruebas Realizadas
Durante la ejecución se verificaron correctamente las siguientes operaciones:

Agregar joyas nuevas al inventario

Buscar joyas por SKU

Listar todas las joyas registradas

Eliminar joyas correctamente

Buscar por tipo y material

✅ Resultado: todas las funciones CRUD operan correctamente desde consola.

🧱 Arquitectura MVC
El sistema sigue una clara separación de responsabilidades:

Modelo (model) → Gestiona los datos y la lógica de negocio (clases Jewelry y JewelryDAO)

Vista (view) → Interactúa con el usuario mediante consola (JewelryView)

Controlador (controller) → Coordina las acciones entre modelo y vista (CtrlJewelry)

App.java → Punto de entrada que inicializa el sistema

🧾 Conclusiones
El patrón MVC mejora la organización y mantenimiento del código.

La separación de responsabilidades facilita futuras modificaciones.

Este laboratorio refuerza la comprensión de arquitectura en capas dentro del desarrollo Java.

---
