class Car:

    # Default constructor
    def __init__(self):
        self.color = ""
        self.model = ""


    # Constructor
    # def __init__(self, color, model):
    #     self.color = color
    #     self.model = model 
    # ? what is the purpose of self
    # ONLY ONE CONSTRUCTOR CAN BE THERE AT A GIVEN POINT OF TIME
    # WRITING TWO __init__ CONSTRUCTORS WILL OVERRRIDE THE FIRST ONE


    # Method

    def start_engine(self):
        print("Engine started")
    def returnInfo(self):
        print(f"The color is {self.color}")
        print(f"The model version is {self.model}")

if __name__ == "__main__":
# ? why
    object = Car()
    object.color = "Red"
    object.model = "MTR"


    object.start_engine()
    object.returnInfo() 
    # print(object.model)
    # print(object.color)



