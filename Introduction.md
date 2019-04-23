# TDD Dojo

---

You can follow these slides under

http://glencoe.github.com/TDDDojo/

<img src="http://api.qrserver.com/v1/create-qr-code/?color=000000&amp;bgcolor=FFFFFF&amp;data=http%3A%2F%2Fglencoe.github.io%2FTDDDojo&amp;qzone=1&amp;margin=0&amp;size=400x400&amp;ecc=L" alt="qr code" />

---

## What this course is
- A hands on exercise in TDD
- A platform for your questions
- An opportunity to 
   - become a better programmer
   - learn more about software development

---

## During the course
- You'll start developing
your own software project
- Or implement a project proposed by us (most likely a small lib for graph representation / visualization / serialization / manipulation)
- We will have a look at problems you encounter and discuss possible solutions

---

## What the course is not
- A lecture
   - most of the time it's you coding and not me talking

---

## What TDD is
- An approach to programming helping you to produce
   good quality, testable and tested code

---

## What TDD Is Not
- A way to find every possible bug
- A dogmatic rulebook you always have to follow
- A cooking recipe producing good code automatically
	- You can still mess up <!-- .element: class="fragment" -->	
	- You still have to design <!-- .element: class="fragment" -->
	- You'll still have to write other tests <!-- .element: class="fragment" -->

---

## Good Quality Code
- Correct
- Easily extensible/adjustable
- Easy to use/understand
- Without unnecessary functionality
- Without redundancies

---

## Why Do We Care?
- Hunting bugs is hard, tedious, frustrating and expensive
- Sometimes the application isn't made up from your software alone
- How do you tell whether your software or the hardware/database/whatever else is misbehaving

---

- Discovering bugs after deployment is even worse
- ESAs Ariane 5 destroyed 40 seconds after takeoff, 1 billion dollar
  - Due to integer overflow
- Bug in a radiation therapy machine killed at least 5 people in the 80s
- Did the recently added feature break other parts of the system

---

## How Do We Know?
- Formal proofs are too hard and expensive for complex applications
- Tests will at least tell you that the parts you tested are correct
- Why care about tests, when we have debuggers?

---

## Test Structure 
- What will a failing test say about your codes state?
- Depends on the test
- Therefore make them test one thing -> unit tests
- Make them explore the boundaries of your system

---

## Testing Is Hard
- You'll want your tests like want your production code:
- Correct, easily extensible/adjustable, etc.
- High coverage
- So what... write tests for your tests? <!-- .element: class="fragment" -->
- Yes! <!-- .element: class="fragment" -->
- Our Production code will do exactly that <!-- .element: class="fragment" -->

---

## The Overall Idea
- Make tests first class citizens on par with production code
- Design your tests as you design your production code
- Let the tests drive your *__design__*
- Every piece of code is tested, and testable
- Leads to a modular *__design__*

---

## Three Laws of TDD
- You are not allowed to write any
   1. production code unless it is to make a failing unit test pass.
   2. any more of a unit test than is sufficient to fail; and compilation failures are failures.
   3. more production code than is sufficient to pass the one failing unit test.

---

# Cycles

---

## Nano-Cycle - seconds
Corresponds to the three laws
- write test
- <span style="color: #cc0000">run tests</span>
- write production code
- <span style="color: #00b300">run tests</span>
- repeat

---

## Micro-Cycle - minutes
![micro-cycle](http://marcabraham.files.wordpress.com/2012/04/06_red_green_refactor.jpg)

---

# Let's Start

---

## Programming Language
Let's choose our language:
- Java
- Python
- Ruby
- C
- Clojure
- Rust

---

## The Testing Framework
- For C install [ceedling](https://github.com/ThrowTheSwitch/Ceedling)
- For Clojure install [leiningen build tool](https://leiningen.org/)
- For other languages checkout the corresponding directory in the TDD Dojo repo and read the README.md

---

## Setup
- Create a repo on github or our [bitbucket server](http://bitbucket.es.uni-due.de:7990)
- Clone the TDDDojo from github, here you'll find examples to get you started
```bash
git clone https://github.com/glencoe/TDDDojo.git
mkdir MyNewProject
cp -r TDDDojo/python/* MyNewProject/
cd MyNewProject
git init
git remote add origin https://your-remote-repos-address
git add -A
git commit -m "initial commit"
git push
```

---

## The Prime Factor Kata
Write a function that yields the prime factors for a given number

---

## First Test
```java
@Test
void one(void) {
   assertEquals(list(),Kata.primeFactors(1);
}
```
Won't compile. We're <span style="color: #cc0000">red</span>.

---

## Make it compile
add this to your test class
```java
List<Integer> list(){
   return null;
}
```

and this to your production code
```java
public class Kata {
   public List<Integer> primeFactors(int n){
      return null;
   }
}
```

Now we're <span style="color: #00b300">green</span>

---

## Second test
```java
@Test
public void two(){
  assertEquals(list(2), Kata.primeFactors(2));
}
```
Won't compile. We have to fix our `list()` method.

---

## Fix the list method

```java 
List<Integer> list(int... numbers){
  List<Integer> list = new ArrayList<>();
  for (int number: numbers){
    list.add(number);
  }
  return list;
}
```
Compile and see the tests fail.

---

## Make it green

```java
public List<Integer> primeFactors(int n){
  List<Integer> primes = new ArrayList<>();
  if (n > 1)
    primes.add(2);
  return primes;
}
```

---

## It's your turn

- think about the next test 
- remember that it should make your code fail

---

## Rule of thumb

The production code gets more abstract as the tests get more specific

---

## There are more Katas

- http://codingdojo.org/kata/
- http://codekata.com
- invent your own, e.g. implement a board game

---

## Next Time
- Pitch your project
- Do some rough diagrams
- Start coding
