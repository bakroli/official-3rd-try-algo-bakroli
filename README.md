# Minimum hozzáadás
## Bevezetés
Ebben a feladatban egy metódust kell létrehoznod, ami egy tömböt dolgoz fel.

Az alább meghatározott metódust a `addminimum` csomagban (package) előre elkészített `hu.nive.ujratervezes.addminimum.AddMinimum` osztályban írd meg!

A `Main` osztály `main` metódusában próbálhatod ki a kódodat, illetve használd
az előre megírt teszteseteket az algoritmusod kipróbálására!

## Feladatleírás

Írj egy metódust a `hu.nive.ujratervezes.addminimum.AddMinimum` osztályban a következő specifikácó alapján:

- a metódus neve: `addMinimum` (minimum hozzáadása)
- a metódus bemeneti paraméterei:
    - `numbers`, egy egész számokat tartalmazó tömb `int[]`
    - `n`, egy egész szám `int`
- visszatérési értéke:
  - egy új, egész számokat tartalmazó tömb `int[]`

Az `addMinimum` metódus:
Megkeresi a minimum értéket a `numbers` tömben. Vissza ad egy tömböt amire a következő igaz:
- minden `n`-edik elem a `numbers` tömb azonos indexén található elem és a minimum összege.
- a többi elem a `numbers` tömb azonos indexén található elemel egyezik.

A beépített `sort()` vagy `max()` metódusok használata a feladat megoldása során nem megengedet.

Kivételkezelés:

- ha a metódust úgy hívjuk meg, hogy a `numbers` paraméter egy üres tömb, akkor
  adjon vissza egy új, üres tömböt
- ha a metódust úgy hívjuk meg, hogy a `numbers` paraméter értéke `null`, akkor
  dobjon `IllegalArgumentException`-t
- ha a metódust úgy hívjuk meg, hogy az `n` paraméter értéke kisebb, mint `1`,
  akkor dobjon `IllegalArgumentException`-t
  
## Példák

| `numbers`             | `n`  | visszatérési érték (vagy exception) |
| :-------------------- | :--: | :---------------------------------- |
| `[-2, -1, 0, 1, 2]`   | `3`  | `[-2, -1, -2, 1, 2]`                |
| `[3, 1, 5, 3, 4]`     | `1`  | `[4, 2, 6, 4, 5]`                   |
| `[2, 12]`             | `2`  | `[2, 14]`                           |
| `[]`                  | `1`  | `[]`                                |
| `null`                | `1`  | `IllegalArgumentException`          |
| `[2, 12]`             | `0`  | `IllegalArgumentException`          |
| `[2, 12]`             | `-1` | `IllegalArgumentException`          |

## Test-ek
`
    @Test
    void testAddMinimum_validInput() {
        Assertions.assertArrayEquals(new int[]{-2, -1, -2, 1, 2},new AddMinimum().addMinimum(new int[]{-2, -1, 0, 1, 2},3));
    }

    @Test
    void testAddMinimum_validInput1() {
        Assertions.assertArrayEquals(new int[]{4, 2, 6, 4, 5},new AddMinimum().addMinimum(new int[]{3, 1, 5, 3, 4},1));
    }

    @Test
    void testAddMinimum_validInput2() {
        Assertions.assertArrayEquals(new int[]{2, 14},new AddMinimum().addMinimum(new int[]{2, 12},2));
    }

    @Test
    void testAddMinimum_emptyArray() {
        Assertions.assertArrayEquals(new int[]{},new AddMinimum().addMinimum(new int[]{},1));
    }

    @Test
    void testAddMinimum_throwsIllegalArgumentExceptionForNullParameter() {
        AddMinimum addMinimum = new AddMinimum();
        Assertions.assertThrows(IllegalArgumentException.class,()-> addMinimum.addMinimum(null,1));
    }

    @Test
    void testAddMinimum_throwsIllegalArgumentExceptionForZero() {
        AddMinimum addMinimum = new AddMinimum();
        Assertions.assertThrows(IllegalArgumentException.class,()-> addMinimum.addMinimum(new int[]{2, 12},0));
    }

    @Test
    void testAddMinimum_throwsIllegalArgumentExceptionForNegative() {
        AddMinimum addMinimum = new AddMinimum();
        Assertions.assertThrows(IllegalArgumentException.class,()-> addMinimum.addMinimum(new int[]{2, 12},-1));
    }
`

## Pontozás
A feladat 0 pontot ér, bármely alábbi esetben:
- le sem fordul az adott projekt.
- teszteset sem fut le sikeresen
- ha a forráskód olvashatatlan, nem felel meg a konvencióknak, nem követi a clean code alapelveket
- ha kielégíti a teszteseteket, de a szöveges követelményeknek nem felel meg

Clean code-ra adható pontok: max 10

Tesztekre adható pontok:

| Teszt | Pont |
--- | ---- 
|testAddMinimum_validInput                                          | 1 pont |
|testAddMinimum_validInput1                                         | 1 pont |
|testAddMinimum_validInput2                                         | 1 pont |
|testAddMinimum_emptyArray                                          | 1 pont |
|testAddMinimum_throwsIllegalArgumentExceptionForNullParameter      | 2 pont |
|testAddMinimum_throwsIllegalArgumentExceptionForZero               | 2 pont |
|testAddMinimum_throwsIllegalArgumentExceptionForNegative           | 2 pont |

