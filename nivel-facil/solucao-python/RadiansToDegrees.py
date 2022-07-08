
from math import pi 

def radians_to_degrees(angle):
    result = angle * 180 / pi
    print("%.1f" % result)
    

radians_to_degrees(20)