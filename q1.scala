object InventoryManagementSystem {
  var itemNames: Array[String] = Array("Apple", "Banana", "Orange")
  var itemQuantities: Array[Int] = Array(50, 30, 20)

  def displayInventory(): Unit = {
    println("Inventory:")
    for (i <- itemNames.indices) {
      println(s"${itemNames(i)}: ${itemQuantities(i)}")
    }
  }

  def restockItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index >= 0) {
      itemQuantities(index) += quantity
      println(s"Restocked $quantity of $itemName. New quantity: ${itemQuantities(index)}")
    } else {
      println(s"Item $itemName does not exist.")
    }
  }

  def sellItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index >= 0) {
      if (itemQuantities(index) >= quantity) {
        itemQuantities(index) -= quantity
        println(s"Sold $quantity of $itemName. Remaining quantity: ${itemQuantities(index)}")
      } else {
        println(s"Not enough $itemName in stock to sell $quantity. Current quantity: ${itemQuantities(index)}")
      }
    } else {
      println(s"Item $itemName does not exist.")
    }
  }

  def main(args: Array[String]): Unit = {
    displayInventory()
    restockItem("Banana", 20)
    sellItem("Orange", 15)
    sellItem("Apple", 60)
    restockItem("Grapes", 40)
    displayInventory()
  }
}
