*Advanced xPath(Axes based xPath)*
     1. Parent to Child:
        Syntax:
         `BasicRelativeXpathforParent/childTagname`
        Example:
          `(//form[@id='login']/p)[2] `

     2. Child to Parent:
        Syntax:
         ` BasicRelativeXpathforChild/parent::parenttagname` 
        Example:
        ` //label[text()='Password']/parent::p`
         `//p[@class='top']/parent::form`    

     3. GrandParent to GrandChild:
        Syntax:
          `BasicRelativeXpathforGrandParent//grandchildTagname` 
        Example:
          `(//form[@id='login']//input)[3] `     

     4. GrandChild to GrandParent:
        Syntax:
            ` BasicRelativeXpathforGrandChild/ancestor::Grandparenttagname`   
        Example:
          `//input[@class='decorativeSubmit']/ancestor::form` 

     5. ElderCousin to YoungerCousin:
        Syntax:
           `BasicRelativeXpathforElderCousin/following::youngerCousintagname`   
        Example:
           `//span[text()='Company Name']/following::input  
           
     6. YoungerCousin to ElderCousin:
        Syntax:
            `BasicRelativeXpathforYoungerCousin/preceding::ElderCousintagname`   
        Example:
           `//input[@id='createLeadForm_firstName']/preceding::input[2] ` 


     7. ElderSibling to YoungerSibling:
        Syntax:      
           `BasicRelativeXpathforElderSibling/following-sibling::youngerSiblingtagname`
        Example:
           `//label[text()='Username']/following-sibling::input`
      
     8. YoungerSibling to ElderSibling:
        Syntax:
          `BasicRelativeXpathforYoungerSibling/preceding-sibling::ElderSiblingtagname`
        Example:  
           `//input[@id='username']/preceding-sibling::label`    
              `       
     
### Exceptions:
### InvalidSelectorException
1. **Definition**: 
   - This exception occurs when the format of a given selector is incorrect or unsupported. 
2. **Common Causes**:
   - Syntax errors in the selector string.
3. **Handling Tips**:
   - Double-check the syntax of your selector.
   

### NoSuchElementException
1. **Definition**: 
     - This exception is thrown when an element could not be found on the page.
     - It indicates that the search operation did not locate the element within the current webpage.
2. **Common Causes**:
     - The element does not exist on the page at the time of search.
     - The selector used does not correctly identify the desired element.
     - The element is not loaded yet due to web page's dynamic loading or delays.
3. **Handling Tips**:
   - Ensure the correctness of the selector.
   - Use waits ( implicit) to allow time for the element to load.





   Advanced Xpath:

   1. **Parent to child**


      Parent xpath / tag name of child
      //div[@id='usernamegroup']/label
      //form[@id='login']/p[2]

   2. **child to Parent**

      child xpath /parent:: tag of parent

      //div[@id='form']/parent::div
      //input[@class='decorativeSubmit']/parent::p

   3. **Grand parent to Grand child**

      Grandparent xpath // tag name of grand child

      //form[@id='login']//input
      (//form[@id='login']//label)[2]

   4. **Grandchild to Grand Parent**

      Grand child xpath /ancestor :: tag name of the grand parent  (Very to use this)

      //input[@class='decorativeSubmit']/ancestor::html
      //input[@class='decorativeSubmit']/ancestor::div[@id='form']

   5. **Elder sibling to younger sibling**

      Elder sibling xpath /following-sibling:: tagName of the younger sibling

      //label[text()='Username']/following-sibling::input
      //p[@class='top']/following-sibling::p

   6. **Younger sibling to Elder sibling**

      younger sibling xpath / prceding-sibling:: tagname of elder sibling

      //div[@id='footer']/preceding-sibling::div
      //input[@id='twotabsearchtextbox']/preceding-sibling::label

   7. **Elder cousins to younger cousins**

      Elder cousin xpath /following:: tagname of younger cousin
      //label[@for='twotabsearchtextbox']/following::img
      //div[@class='navFooterLinkCol navAccessibility']/following::ul
      


   8. **Younger cousin to elder cousin** (Not Use in real time projects)

      Younger cousin xpath/ preceding:: tagname of elder cousin.
      //button[@aria-label='Close']/preceding::span
      


   