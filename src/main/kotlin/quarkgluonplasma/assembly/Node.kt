package quarkgluonplasma.assembly

interface Node
{
    var id: String
    var assembly: Assembly
    var parent: Parent

    var rotX: Double
    var rotY: Double
    var rotZ: Double

    var translateX: Double
    var translateY: Double
    var translateZ: Double

    var scaleX: Double
    var scaleY: Double
    var scaleZ: Double


}