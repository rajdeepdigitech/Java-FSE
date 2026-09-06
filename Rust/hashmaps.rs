use std::collections::HashMap;

fn main() {
    let mut capital_cities = HashMap::new();

    capital_cities.insert("France", "Paris");
    capital_cities.insert("Japan", "Tokyo");

    println!("Capital of Japan is {}", capital_cities["Japan"]);
}