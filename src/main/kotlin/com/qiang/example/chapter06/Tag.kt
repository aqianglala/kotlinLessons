package com.qiang.example.chapter06

open class Tag(val name: String) : Node {

    // 子节点
    val children = ArrayList<Node>()

    val properties = HashMap<String, String>()

    operator fun String.invoke(value: String) {
        properties[this] = value
    }

    operator fun String.invoke(block: Tag.() -> Unit) {
        this@Tag.children.add(Tag(this).apply(block))
    }

    operator fun String.unaryPlus(){
        children.add(StringNode(this))
    }

    operator fun plus(node: Node) {
        children.add(node)
    }

    override fun render(): String {
        return StringBuilder().append("<$name")
                .let { stringBuilder ->
                    if (!properties.isEmpty()) {
                        stringBuilder.append(" ")
                        properties.forEach {
                            stringBuilder.append("${it.key}=\"${it.value}\" ")
                        }
                    }
                    stringBuilder.append(">")
                    if (children.size > 0) {
                        children.forEach {
                            stringBuilder.append(it.render())
                        }
//                        children.map(Node::render).map(stringBuilder::append)
                    }
                    stringBuilder
                }
                .append("</$name>")
                .toString()
    }

}