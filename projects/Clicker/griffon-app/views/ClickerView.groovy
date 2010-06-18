application(title:'Clicker',
  size:[180,80],
  locationByPlatform:true,
  iconImage: imageIcon('/griffon-icon-48x48.png').image,
  iconImages: [imageIcon('/griffon-icon-48x48.png').image,
               imageIcon('/griffon-icon-32x32.png').image,
               imageIcon('/griffon-icon-16x16.png').image]
) {
    def count = 0
    gridLayout(rows: 2, cols: 1)
    textlabel = label()
    button(
        text:'Click Me', 
        actionPerformed: {
            count++
            textlabel.text = "Count: $count" })
}
