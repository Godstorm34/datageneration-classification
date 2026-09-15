# Data Generation and Classification — Module Project

Java 8 / Eclipse project for the module **Conceptos Fundamentales de
Programación** (Politécnico Grancolombiano). Delivery type: design of a
documented Java program.

## Current status: Entrega 1 (Semana 3)

This delivery implements only the first of the two required `main`
classes: **`GenerateInfoFiles`**. It generates the pseudo-random flat
files that the second program (class `main`, to be added in a later
delivery) will read and process.

## Project structure

```
src/
  GenerateInfoFiles.java   -> entry point for this delivery, contains
                               the three required generation methods
  Product.java             -> immutable model class for a product
  Salesman.java             -> immutable model class for a salesman
```

## What `GenerateInfoFiles` does

Running its `main` method:

1. Generates a product catalog with `createProductsFile(int productsCount)`
   → writes `products.txt` as `IDProducto;NombreProducto;PrecioPorUnidad`.
2. Generates salesmen records with `createSalesManInfoFile(int salesmanCount)`
   → writes `salesmen.txt` as `TipoDocumento;NumeroDocumento;Nombres;Apellidos`.
3. Generates one sales file per salesman with
   `createSalesMenFile(int randomSalesCount, String name, long id)`
   → writes `sales_<id>.txt`, first line `TipoDocumento;NumeroDocumento`,
   followed by one `IDProducto;CantidadVendida;` line per sale.

None of the methods request input from the user; the amount of
generated data is controlled by constants at the top of the class.

The program prints a success message with a short summary, or an error
message if something goes wrong while writing the files.

## Design decisions

- `createSalesMenFile` does not receive a document type parameter (per
  the assignment's required signature), so a fixed default (`"CC"`) is
  used for every generated sales file.
- Random product ids written into sales files fall in
  `[1, DEFAULT_PRODUCTS_COUNT]`, matching the ids produced by
  `createProductsFile` when run with its default count, so references
  stay valid between files.
- Salesmen and products are modeled as small immutable classes
  (`Salesman`, `Product`) instead of raw arrays/strings, and the
  generation methods return the generated lists so `main` can reuse the
  data without re-reading the files it just wrote.

## How to run

Import as an existing Eclipse project (`File → Import → Existing
Projects into Workspace`), then run `GenerateInfoFiles` as a **Java
Application**. The generated `.txt` files will appear in the project's
root folder.

## Next deliveries

- Entrega 2 (Semana 5): preliminary version of the full project.
- Entrega 3 (Semanas 7-8): final version, including the second `main`
  class (sales/product reports) and `conclusion.txt`.
