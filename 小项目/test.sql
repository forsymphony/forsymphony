/*
 Navicat Premium Data Transfer

 Source Server         : forsymphony
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 20/10/2020 15:31:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for attendance
-- ----------------------------
DROP TABLE IF EXISTS `attendance`;
CREATE TABLE `attendance`  (
  `ATTENNO` int(0) NOT NULL,
  `DAY` int(0) NULL DEFAULT NULL,
  `VACATE` int(0) NULL DEFAULT NULL,
  `LATE` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`ATTENNO`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of attendance
-- ----------------------------
INSERT INTO `attendance` VALUES (30001, 20, 1, 1);
INSERT INTO `attendance` VALUES (30002, 20, 1, 1);
INSERT INTO `attendance` VALUES (30003, 21, 0, 1);
INSERT INTO `attendance` VALUES (30004, 11, 1, 1);
INSERT INTO `attendance` VALUES (30005, 10, 1, 3);
INSERT INTO `attendance` VALUES (30006, 30, 1, 1);
INSERT INTO `attendance` VALUES (30007, 17, 0, 1);

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `DEPTNO` int(0) NOT NULL,
  `DEPTNAME` char(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`DEPTNO`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (20001, '人力资源部');
INSERT INTO `dept` VALUES (20002, '财务部');
INSERT INTO `dept` VALUES (20003, '生产技术部');
INSERT INTO `dept` VALUES (20004, '计划营销部');
INSERT INTO `dept` VALUES (20005, '后勤部');
INSERT INTO `dept` VALUES (20006, '后勤部');
INSERT INTO `dept` VALUES (20007, '总裁部');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `EMPNO` int(0) NOT NULL,
  `DEPTNO` int(0) NULL DEFAULT NULL,
  `WAGENO` int(0) NULL DEFAULT NULL,
  `ATTENNO` int(0) NULL DEFAULT NULL,
  `ENAME` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `GENDER` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `TEL` char(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `EMAIL` char(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ADDRESS` char(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`EMPNO`) USING BTREE,
  INDEX `FK_attendance`(`ATTENNO`) USING BTREE,
  INDEX `FK_have`(`WAGENO`) USING BTREE,
  INDEX `FK_work`(`DEPTNO`) USING BTREE,
  CONSTRAINT `FK_attendance` FOREIGN KEY (`ATTENNO`) REFERENCES `attendance` (`ATTENNO`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_have` FOREIGN KEY (`WAGENO`) REFERENCES `wage` (`WAGENO`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_work` FOREIGN KEY (`DEPTNO`) REFERENCES `dept` (`DEPTNO`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES (10001, 20005, 30001, 30001, '刘备', '男', '11011', '128@qq.com', '云南');
INSERT INTO `employee` VALUES (10002, 20002, 30002, 30002, '关羽', '男', '120', 'guanyu@qq.com', '四川');
INSERT INTO `employee` VALUES (10003, 20006, 30003, 30003, '张飞', '男', '119', 'zhangfei@qq.com', '桃园');
INSERT INTO `employee` VALUES (10004, 20004, 30004, 30004, '哼哈', '男', '886', 'hengha@qq.com', '天庭');
INSERT INTO `employee` VALUES (10005, 20001, 30005, 30005, '诸葛亮', '男', '999', 'zhugeliang@qq.com', '隆中');
INSERT INTO `employee` VALUES (10006, 20003, 30006, 30006, '大乔', '女', '233', 'daqiao@qq.com', '江东');
INSERT INTO `employee` VALUES (10007, 20007, 30007, 30007, '小乔', '女', '666', 'xiaoqiao@qq.com', '江东');

-- ----------------------------
-- Table structure for nomaluser
-- ----------------------------
DROP TABLE IF EXISTS `nomaluser`;
CREATE TABLE `nomaluser`  (
  `EMPNO` int(0) NOT NULL,
  `NOMALID` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `NPASSWORD` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`EMPNO`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of nomaluser
-- ----------------------------
INSERT INTO `nomaluser` VALUES (10001, 'liubei', '123456');
INSERT INTO `nomaluser` VALUES (10002, 'guanyu', '123456');

-- ----------------------------
-- Table structure for rootuser
-- ----------------------------
DROP TABLE IF EXISTS `rootuser`;
CREATE TABLE `rootuser`  (
  `ROOTID` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `RPASSWORD` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`ROOTID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rootuser
-- ----------------------------
INSERT INTO `rootuser` VALUES ('feiwutaotai', '123456');
INSERT INTO `rootuser` VALUES ('hkd', '123456');
INSERT INTO `rootuser` VALUES ('hxj', '123456');

-- ----------------------------
-- Table structure for wage
-- ----------------------------
DROP TABLE IF EXISTS `wage`;
CREATE TABLE `wage`  (
  `WAGENO` int(0) NOT NULL,
  `BASE_WAGE` double NULL DEFAULT NULL,
  `REAL_WAGE` double NULL DEFAULT NULL,
  PRIMARY KEY (`WAGENO`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wage
-- ----------------------------
INSERT INTO `wage` VALUES (30001, 2000, 3880);
INSERT INTO `wage` VALUES (30002, 3000, 4880);
INSERT INTO `wage` VALUES (30003, 2000, 4080);
INSERT INTO `wage` VALUES (30004, 4000, 4980);
INSERT INTO `wage` VALUES (30005, 2000, 2840);
INSERT INTO `wage` VALUES (30006, 5000, 7880);
INSERT INTO `wage` VALUES (30007, 6000, 7680);

SET FOREIGN_KEY_CHECKS = 1;
