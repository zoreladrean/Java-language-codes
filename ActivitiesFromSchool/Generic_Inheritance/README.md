# Generic Inheritance
Implement the ff:

-   Generic  `interface Handler`with types  `<T>`  
    1.  Methods:  
        1.  `T handle(T t);`
-   Generic`abstract class Storage`  with types  `<T>`  
    1.  Protected variables:  
        1.  `t`  of type  `T`
    2.  Methods:  
        1.  `Setter`and  `Getter`for  `t`
-   Generic`class DataHandler`  with types  `<T>`  
    1.  Inherits from both  `Storage`  and  `Handler`. Reflect type  `<T>`  to that of`Handler`  and  `Storage`(They all use the same type)
    2.  public Methods  
        1.  `T handle(T t)`  implementation:  
            1.  Update value of held item  `t`
            2.  Print  `"Processing {t's String equivalent}"`
            3.  Return  `t`
        2.  `T handleData()`  
            -   `handle()`  and return the current data held
---
### Sample Outputs: 
- ![sample output 1]()
- ![sample output 2]()