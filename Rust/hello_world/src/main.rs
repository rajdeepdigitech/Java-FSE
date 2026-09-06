// use std::io;

fn main() {

    println!("{} days", 31);
    println!("Today is {0} and it is the best day of my life, {1}", "Tuesday", "Pushpal" );

    println!("{condition}", condition="This is true!");

    // Different formatting of a number 

    println!("Base 10 : {}", 69420); // Will print the normal number 
    println!("Base 2 (binary): {:b}", 69420); // for binary number
    println!("Base 8 (octal): {:o}", 69420); // for base 8
    println!("Base 16 (hexadecimal): {:x}", 69420); // for base 16

    // Right justifying texts 

    println!("{number:>5}", number=3);
    println!("z{number:#>5}", number=4);

    // Left adjust by flipping the sign 

    println!("{number:0<5}", number=1);
    println!("{number:@<5}", number=2);
    println!("My name is {0}, {1}, {2}", "Suyash", "Soni", "III");

    let x : i32 = 26;
    println!("The val of this variable is {}", x);

    //#[allow (dead_code)]

    //struct Structure(i32);

    let number: f64 = 1.0;
    let width: usize = 5;
    println!("{number:>width$}");

    // signed integers -> i8, i16, i32, i64, i128, isize, pointer size
    // unsigned integers -> u8, u16, u32, u64, u128, usize, pointer size 

    // value of a unit type is a tuple but not considered as a compound type 
    // as it doesn't contain multiple values 

    // Annotation 
    
    println!("TOPIC :: VARIABLES");
    
    let logical: bool= true;

    let a_float: f64 = 1.0; // Normal annotation 
    let an_integer = 5i32; // Suffix annotation 
    
    // Normally a default is used 

    let default_float = 3.0; // 'f64'
    let default_integer = 80; // 'i32'
    
    // A type can be inferred from context 
    let mut inferred_type = 12; // Type i64 is inferred from another line 
    inferred_type = 4294967296i64; // Type i64 

    // A mutable variable's value can be changed 
    let mut mutable = 12; 
    mutable = 21;

    // Error ! The type of a variable can't be changed. 

    // mutable = true; 

    // Variables can be overwritten with shadowing 

    let mutable = true;

    /* Compound types - Array & Tuples */
    
    // Array signature consists of Type T and length as [T; length]
    let my_array: [i32; 5] = [1, 2, 3, 4, 5];

    // Tuple is a collection of values of different types 
    // and is constructed using parenthesis ().
    
    let my_tuple = (5u32, 1u8, true, -5.04f32);

    println!(" === LITERALS AND OPERATORS ===");
    
    // Integer addition 

    println!("1 + 2 = {}", 1u32 + 2);

    // Integer subtraction 

    println!("1 - 2 = {}", 1i32 - 2);

    // Scientific notation 

    println!("1e4 is {}, -2.5e-3 is {}", 1e4, -2.5e-3); // ? -> Didn't understand

    // Short-circuiting boolean logic 

    println!("true AND false is {}", true && false);
    println!("true OR false is {}", true || false);
    println!("NOT true is {}", !true);

    // Bitwise operations 

    println!("0011 AND 0101 is {:04b}", 0b0011u32 & 0b0101);
    println!("0011 OR 0101 is {:04b}", 0b0011u32 | 0b0101);
    println!("0011 XOR 0101 is {:04b}", 0b0011u32 ^ 0b0101);

    println!("1 << 5 is {}", lu32 << 5);
    println!("0x80 >> 2 is 0x{:x}". 0x80u32 >> 2);

    // Use underscores to improve readability! 

    println!("One million is written as {}", 1_000_000u32);





}
