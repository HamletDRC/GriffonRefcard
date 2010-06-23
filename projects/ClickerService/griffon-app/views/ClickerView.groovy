application(title:'Clicker',
  size:[180,80],
  locationByPlatform:true,
  iconImage: imageIcon('/griffon-icon-48x48.png').image,
  iconImages: [imageIcon('/griffon-icon-48x48.png').image,
               imageIcon('/griffon-icon-32x32.png').image,
               imageIcon('/griffon-icon-16x16.png').image]
) {
    gridLayout(rows: 2, cols: 1)
    label(text:bind {model.message})
    button(text: 'Click Me', actionPerformed: controller.&action)
}
