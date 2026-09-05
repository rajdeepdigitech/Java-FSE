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
}
