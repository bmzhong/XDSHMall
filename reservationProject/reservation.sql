/*
Navicat MySQL Data Transfer

Source Server         : cookie123
Source Server Version : 50718
Source Host           : cookie qq 2118119173
Source Database       : secondhandgoods

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2019-05-27 15:41:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin_user
-- ----------------------------
DROP TABLE IF EXISTS `admin_user`;
CREATE TABLE `admin_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin_user
-- ----------------------------
INSERT INTO `admin_user` VALUES ('1', 'admin', 'admin');
INSERT INTO `admin_user` VALUES ('2', 'hfb', 'hfb');

-- ----------------------------
-- Table structure for classification
-- ----------------------------
DROP TABLE IF EXISTS `classification`;
CREATE TABLE `classification` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(255) DEFAULT NULL,
  `parent_id` int(11) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=140 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classification
-- ----------------------------
INSERT INTO `classification` VALUES ('104', '学习资料', '0', '1');
INSERT INTO `classification` VALUES ('105', '校内课本', '0', '1');
INSERT INTO `classification` VALUES ('106', '课外书', '0', '1');
INSERT INTO `classification` VALUES ('107', '生活用品', '0', '1');
INSERT INTO `classification` VALUES ('108', '学习用具', '0', '1');
INSERT INTO `classification` VALUES ('109', '考研教材', '104', '2');
INSERT INTO `classification` VALUES ('110', '专业课本', '104', '2');
INSERT INTO `classification` VALUES ('111', '专业书籍', '105', '2');
INSERT INTO `classification` VALUES ('112', '棉被', '107', '2');
INSERT INTO `classification` VALUES ('113', '水桶', '107', '2');
INSERT INTO `classification` VALUES ('114', '水壶', '107', '2');
INSERT INTO `classification` VALUES ('115', '笔', '108', '2');
INSERT INTO `classification` VALUES ('116', '运动器材', '0', '1');
INSERT INTO `classification` VALUES ('117', '篮球', '116', '2');
INSERT INTO `classification` VALUES ('118', '足球', '116', '2');
INSERT INTO `classification` VALUES ('119', '羽毛球', '116', '2');
INSERT INTO `classification` VALUES ('120', '电子产品', '0', '1');
INSERT INTO `classification` VALUES ('121', '电脑配件', '120', '2');
INSERT INTO `classification` VALUES ('122', '手机', '120', '2');
INSERT INTO `classification` VALUES ('123', '电脑笔记本', '120', '2');
INSERT INTO `classification` VALUES ('124', '生活用品', '107', '2');
INSERT INTO `classification` VALUES ('125', '运动器材', '107', '2');
INSERT INTO `classification` VALUES ('139', '凉席', '107', '2');

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `addr` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `order_time` datetime DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `total` double DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------

-- ----------------------------
-- Table structure for order_item
-- ----------------------------
DROP TABLE IF EXISTS `order_item`;
CREATE TABLE `order_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `count` int(11) DEFAULT NULL,
  `order_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `sub_total` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_item
-- ----------------------------
INSERT INTO `order_item` VALUES ('33', '1', '26', '98', '48');
INSERT INTO `order_item` VALUES ('34', '1', '26', '100', '120');

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `csid` int(11) DEFAULT NULL,
  `desc` varchar(1000) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `is_hot` int(11) DEFAULT NULL,
  `market_price` double DEFAULT NULL,
  `pdate` datetime DEFAULT NULL,
  `shop_price` bigint(20) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=108 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('98', '119', '12个羽毛球以前没有用过的，毕业了甩卖', '/mall/admin/product/img/087DEDE9CCE5F6F9C5A31E3F360017.jpg', '1', '56', '2019-05-27 14:54:32', '48', '羽毛球12个');
INSERT INTO `product` VALUES ('99', '113', '水桶水桶水桶水桶水桶水桶水桶水桶水桶水桶水桶水桶水桶水桶水桶水桶水桶水桶', '/mall/admin/product/img/2F72E06EFFA1683B41E31DDF90BF8D.jpg', '1', '32', '2019-05-27 14:56:05', '24', '水桶，9成新没有任何损坏');
INSERT INTO `product` VALUES ('100', '112', '大床棉被，漂亮学姐的，还有香味哦大床棉被，漂亮学姐的，还有香味哦大床棉被，漂亮学姐的，还有香味哦大床棉被，漂亮学姐的，还有香味哦大床棉被，漂亮学姐的，还有香味哦', '/mall/admin/product/img/F2511095726C464EAF21692945CB91.jpg', '1', '180', '2019-05-27 14:57:02', '120', '大床棉被，漂亮学姐的，还有香味哦');
INSERT INTO `product` VALUES ('101', '117', '篮球一个，用了一个月，基本完好篮球一个，用了一个月，基本完好篮球一个，用了一个月，基本完好', '/mall/admin/product/img/E470762CF75566B0F32B98F0D706AA.jpg', '1', '380', '2019-05-27 14:58:00', '175', '篮球一个，用了一个月，基本完好');
INSERT INTO `product` VALUES ('102', '121', '机械手感游戏键盘机械手感游戏键盘机械手感游戏键盘机械手感游戏键盘', '/mall/admin/product/img/D1AC8DCF806E7F5E126F28F168FFA3.jpg', '1', '88', '2019-05-27 14:59:38', '66', '键盘一个，机械手感游戏键盘');
INSERT INTO `product` VALUES ('103', '121', '键盘鼠标一个，8成新键盘鼠标一个，8成新键盘鼠标一个，8成新', '/mall/admin/product/img/7E04FDC830A6BDD135D6D1C5BDF9AC.jpg', '1', '89', '2019-05-27 15:15:48', '76', '键盘鼠标一个，8成新');
INSERT INTO `product` VALUES ('104', '122', '苹果手机4s 原装二手苹果手机4s 原装二手苹果手机4s 原装二手苹果手机4s 原装二手苹果手机4s 原装二手', '/mall/admin/product/img/7B24836D73B7EE5007F92EB491902D.jpg', '1', '1280', '2019-05-27 15:16:56', '450', '苹果手机4s 原装二手');
INSERT INTO `product` VALUES ('105', '122', 'iphone8s,基本全新iphone8s,基本全新iphone8s,基本全新', '/mall/admin/product/img/A516445942BC50C7510EE518E3015A.jpg', '1', '4590', '2019-05-27 15:17:57', '3299', 'iphone8s,基本全新');
INSERT INTO `product` VALUES ('106', '118', '足球一个足球一个足球一个', '/mall/admin/product/img/B0321D8B3890539C4D3E58CF02593E.jpg', '1', '55', '2019-05-27 15:18:37', '34', '足球一个，9成新');
INSERT INTO `product` VALUES ('107', '109', '考研书籍全套考研书籍全套考研书籍全套', '/mall/admin/product/img/9BF21DA88790CDA46D1D917835C8F7.jpg', '1', '260', '2019-05-27 15:19:14', '180', '考研书籍全套');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `addr` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('10', '四川成都', '18380666688@qq.com', 'test', '123456', '18380666688', 'test');
INSERT INTO `user` VALUES ('11', '上海崇明', '18380333333@163.com', '张三', '123456', '18380333333', 'cookie');
INSERT INTO `user` VALUES ('13', '四川成都', '18380226550@qq.com', '测试123', 'test123', '18380226550', 'test123');
INSERT INTO `user` VALUES ('14', '翡翠路', '601610567@qq.com', '吴', '123456', '13866003032', '123456');
INSERT INTO `user` VALUES ('15', '成都11222', '11@qq.com', '张三', '123456', '18480556775', 'zhangsan');
