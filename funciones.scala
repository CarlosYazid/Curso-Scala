//Hay distintos tipos de funciones: las regulares, anonimas o lambda, las tratadas como objetos, etc.

// funcion regular

def factorial(num: Int): Int = {
    if (num == 0) {
        1
    } else {
        num * factorial(num-1)
    }    
}

factorial(4)

// funciones anonimas

val sum_ = (x:Int, y:Int) => x+y

sum_(2,3)

// funciones tipo objeto

object fibonnaci {
  def main(x:Int): Int = x match 
    case 0 | 1 => 1
    case _ => main(x-1) + main(x-2)
}

fibonnaci.main(5)