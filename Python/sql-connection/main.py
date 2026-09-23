import mysql.connector as con 

# Connection with mysql 

mydb = con.connect(
    user='root',
    password='',
    host="localhost",
    database="databass"
)

print(mydb)

# editor = mydb.cursor()
# editor.execute("SELECT CURDATE()")
# print(editor.fetchone())



